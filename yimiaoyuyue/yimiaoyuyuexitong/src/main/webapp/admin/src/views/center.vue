<template>
    <div>
        <el-form
                class="detail-form-content"
                ref="ruleForm"
                :model="ruleForm"
                label-width="80px"
        >
            <el-row>
                <el-col :span="12">
                    <el-form-item v-if="flag=='yiyuanxinxi'" label='医院名称' prop="yiyuanxinxiName">
                        <el-input v-model="ruleForm.yiyuanxinxiName" placeholder='医院名称' clearable></el-input>
                    </el-form-item>
                </el-col>

                <el-col :span="12">
                    <el-form-item v-if="flag=='yiyuanxinxi'" label='医院类型' prop="yiyuanxinxiTypes">
                        <el-select v-model="ruleForm.yiyuanxinxiTypes" placeholder='请选择医院类型'>
                            <el-option
                                    v-for="(item,index) in yiyuanxinxiTypesOptions"
                                    v-bind:key="item.codeIndex"
                                    :label="item.indexName"
                                    :value="item.codeIndex">
                            </el-option>
                        </el-select>
                    </el-form-item>
                </el-col>
                <el-col :span="12">
                    <el-form-item v-if="flag=='yiyuanxinxi'" label='联系方式' prop="yiyuanxinxiPhone">
                        <el-input v-model="ruleForm.yiyuanxinxiPhone" placeholder='联系方式' clearable></el-input>
                    </el-form-item>
                </el-col>

                <el-col :span="12">
                    <el-form-item v-if="flag=='yiyuanxinxi'" label='地区' prop="addressTypes">
                        <el-select v-model="ruleForm.addressTypes" placeholder='请选择地区'>
                            <el-option
                                    v-for="(item,index) in addressTypesOptions"
                                    v-bind:key="item.codeIndex"
                                    :label="item.indexName"
                                    :value="item.codeIndex">
                            </el-option>
                        </el-select>
                    </el-form-item>
                </el-col>
                <el-col :span="12">
                    <el-form-item v-if="flag=='yiyuanxinxi'" label='医院图片' prop="yiyuanxinxiPhoto">
                        <file-upload
                                tip="点击上传照片"
                                action="file/upload"
                                :limit="3"
                                :multiple="true"
                                :fileUrls="ruleForm.yiyuanxinxiPhoto?ruleForm.yiyuanxinxiPhoto:''"
                                @change="yiyuanxinxiPhotoUploadChange"
                        ></file-upload>
                    </el-form-item>
                </el-col>
                <el-col :span="24">
                    <el-form-item v-if="flag=='yiyuanxinxi'" label="医院详情" prop="yiyuanxinxiContent">
                        <editor
                                style="min-width: 200px; max-width: 600px;"
                                v-model="ruleForm.yiyuanxinxiContent"
                                class="editor"
                                action="file/upload">
                        </editor>
                    </el-form-item>
                </el-col>
                <el-col :span="12">
                    <el-form-item v-if="flag=='yonghu'" label='用户姓名' prop="yonghuName">
                        <el-input v-model="ruleForm.yonghuName" placeholder='用户姓名' clearable></el-input>
                    </el-form-item>
                </el-col>

                <el-col :span="12">
                    <el-form-item v-if="flag=='yonghu'" label='头像' prop="yonghuPhoto">
                        <file-upload
                                tip="点击上传照片"
                                action="file/upload"
                                :limit="3"
                                :multiple="true"
                                :fileUrls="ruleForm.yonghuPhoto?ruleForm.yonghuPhoto:''"
                                @change="yonghuPhotoUploadChange"
                        ></file-upload>
                    </el-form-item>
                </el-col>
                <el-col :span="12">
                    <el-form-item v-if="flag=='yonghu'" label='手机号' prop="yonghuPhone">
                        <el-input v-model="ruleForm.yonghuPhone" placeholder='手机号' clearable></el-input>
                    </el-form-item>
                </el-col>

                <el-col :span="12">
                    <el-form-item v-if="flag=='yonghu'" label='电子邮箱' prop="yonghuEmail">
                        <el-input v-model="ruleForm.yonghuEmail" placeholder='电子邮箱' clearable></el-input>
                    </el-form-item>
                </el-col>

                <el-col :span="12">
                    <el-form-item v-if="flag=='yonghu'" label='地区' prop="addressTypes">
                        <el-select v-model="ruleForm.addressTypes" placeholder='请选择地区'>
                            <el-option
                                    v-for="(item,index) in addressTypesOptions"
                                    v-bind:key="item.codeIndex"
                                    :label="item.indexName"
                                    :value="item.codeIndex">
                            </el-option>
                        </el-select>
                    </el-form-item>
                </el-col>
                <el-col :span="12">
                    <el-form-item v-if="flag=='yonghu'" label='余额' prop="newMoney">
                        <el-input v-model="ruleForm.newMoney" placeholder='余额' disabled style="width: 100px"></el-input>
                        <!--<a id="btn-recharge" @click="chongzhi" href="javascript:void(0)">点我充值</a>-->
                    </el-form-item>
                </el-col>
                <el-form-item v-if="flag=='users'" label="用户名" prop="username">
                    <el-input v-model="ruleForm.username"
                              placeholder="用户名"></el-input>
                </el-form-item>
                <el-col :span="12">
                    <el-form-item v-if="flag=='用户'" label="性别" prop="sexTypes">
                        <el-select v-model="ruleForm.sexTypes" placeholder="请选择性别">
                            <el-option
                                    v-for="(item,index) in sexTypesOptions"
                                    v-bind:key="item.codeIndex"
                                    :label="item.indexName"
                                    :value="item.codeIndex">
                            </el-option>
                        </el-select>
                    </el-form-item>
                </el-col>
                <el-col :span="24">
                    <el-form-item>
                        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
                    </el-form-item>
                </el-col>
            </el-row>
        </el-form>
    </div>
</template>
<script>
    // 数字，邮件，手机，url，身份证校验
    import {isNumber, isIntNumer, isEmail, isMobile, isPhone, isURL, checkIdCard} from "@/utils/validate";

    export default {
        data() {
            return {
                ruleForm: {},
                flag: '',
                usersFlag: false,
                // sexTypesOptions : [],
// 注册表 用户
                // 注册的类型字段 用户
                // 性别
                sexTypesOptions: [],
                // 地区
                addressTypesOptions: [],
// 注册表 医院信息
                // 注册的类型字段 医院信息
                // 医院类型
                yiyuanxinxiTypesOptions: [],
                // 地区
                addressTypesOptions: [],
            };
        },
        mounted() {
            //获取当前登录用户的信息
            var table = this.$storage.get("sessionTable");
            this.sessionTable = this.$storage.get("sessionTable");
            this.role = this.$storage.get("role");
            if (this.role != "管理员") {
            }

            this.flag = table;
            this.$http({
                url: `${this.$storage.get("sessionTable")}/session`,
                method: "get"
            }).then(({data}) => {
                if (data && data.code === 0) {
                    this.ruleForm = data.data;
// 注册表 用户
// 注册表 医院信息
                } else {
                    this.$message.error(data.msg);
                }
            });

// 注册表 用户 的级联表
// 注册表 医院信息 的级联表

            this.$http({
                url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=sex_types`,
                method: "get"
            }).then(({data}) => {
                if (data && data.code === 0) {
                    this.sexTypesOptions = data.data.list;
                } else {
                    this.$message.error(data.msg);
                }
            });
            this.$http({
                url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=yiyuanxinxi_types`,
                method: "get"
            }).then(({data}) => {
                if (data && data.code === 0) {
                    this.yiyuanxinxiTypesOptions = data.data.list;
                } else {
                    this.$message.error(data.msg);
                }
            });
            this.$http({
                url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=address_types`,
                method: "get"
            }).then(({data}) => {
                if (data && data.code === 0) {
                    this.addressTypesOptions = data.data.list;
                } else {
                    this.$message.error(data.msg);
                }
            });
            this.$http({
                url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=address_types`,
                method: "get"
            }).then(({data}) => {
                if (data && data.code === 0) {
                    this.addressTypesOptions = data.data.list;
                } else {
                    this.$message.error(data.msg);
                }
            });
        },
        methods: {
            chongzhi() {
                this.$router.replace({path: "/pay"});
            },
            yiyuanxinxiPhotoUploadChange(fileUrls) {
                this.ruleForm.yiyuanxinxiPhoto = fileUrls;
            },
            yonghuPhotoUploadChange(fileUrls) {
                this.ruleForm.yonghuPhoto = fileUrls;
            },


            onUpdateHandler() {
                if ((!this.ruleForm.yiyuanxinxiName) && 'yiyuanxinxi' == this.flag) {
                    this.$message.error('医院名称不能为空');
                    return
                }

                if ((!this.ruleForm.yiyuanxinxiTypes) && 'yiyuanxinxi' == this.flag) {
                    this.$message.error('医院类型不能为空');
                    return
                }

                if ((!this.ruleForm.yiyuanxinxiPhone) && 'yiyuanxinxi' == this.flag) {
                    this.$message.error('联系方式不能为空');
                    return
                }

                if ((!this.ruleForm.addressTypes) && 'yiyuanxinxi' == this.flag) {
                    this.$message.error('地区不能为空');
                    return
                }

                if ((!this.ruleForm.yiyuanxinxiPhoto) && 'yiyuanxinxi' == this.flag) {
                    this.$message.error('医院图片不能为空');
                    return
                }

                if ((!this.ruleForm.yiyuanxinxiContent) && 'yiyuanxinxi' == this.flag) {
                    this.$message.error('医院详情不能为空');
                    return
                }

                if ((!this.ruleForm.yonghuName) && 'yonghu' == this.flag) {
                    this.$message.error('用户姓名不能为空');
                    return
                }

                if ((!this.ruleForm.yonghuPhoto) && 'yonghu' == this.flag) {
                    this.$message.error('头像不能为空');
                    return
                }

                if ('yonghu' == this.flag && this.ruleForm.yonghuPhone && (!isMobile(this.ruleForm.yonghuPhone))) {
                    this.$message.error(`手机应输入手机格式`);
                    return
                }
                if ('yonghu' == this.flag && this.ruleForm.yonghuEmail && (!isEmail(this.ruleForm.yonghuEmail))) {
                    this.$message.error(`邮箱应输入邮箱格式`);
                    return
                }
                if ((!this.ruleForm.addressTypes) && 'yonghu' == this.flag) {
                    this.$message.error('地区不能为空');
                    return
                }

                if ((!this.ruleForm.sexTypes) && this.flag != 'users') {
                    this.$message.error('性别不能为空');
                    return
                }
                if ('users' == this.flag && this.ruleForm.username.trim().length < 1) {
                    this.$message.error(`用户名不能为空`);
                    return
                }
                this.$http({
                    url: `${this.$storage.get("sessionTable")}/update`,
                    method: "post",
                    data: this.ruleForm
                }).then(({data}) => {
                    if (data && data.code === 0) {
                        this.$message({
                            message: "修改信息成功",
                            type: "success",
                            duration: 1500,
                            onClose: () => {
                            }
                        });
                    } else {
                        this.$message.error(data.msg);
                    }
                });
            }
        }
    };
</script>
<style lang="scss" scoped>
</style>
