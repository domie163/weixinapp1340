
<template>
    <view class="content">
        <form class="app-update-pv">
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                      class="title">账户</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.username" type="text" v-model="ruleForm.username" placeholder="账户"></input>
            </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                      class="title">医院名称</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.yiyuanxinxiName" type="text" v-model="ruleForm.yiyuanxinxiName" placeholder="医院名称"></input>
            </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">医院类型</view>
                    <picker @change="yiyuanxinxiTypesChange" :value="yiyuanxinxiTypesIndex" :range="yiyuanxinxiTypesOptions" range-key="indexName">
                        <view
                                :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.yiyuanxinxiTypes?ruleForm.yiyuanxinxiValue:"请选择医院类型"}}</view>
                    </picker>
                </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                      class="title">联系方式</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.yiyuanxinxiPhone" type="text" v-model="ruleForm.yiyuanxinxiPhone" placeholder="联系方式"></input>
            </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">地区</view>
                    <picker @change="addressTypesChange" :value="addressTypesIndex" :range="addressTypesOptions" range-key="indexName">
                        <view
                                :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.addressTypes?ruleForm.addressValue:"请选择地区"}}</view>
                    </picker>
                </view>
                <view
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
                        class="cu-form-group" @tap="yiyuanxinxiPhotoTap">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">医院图片</view>
                    <view class="right-input" style="padding:0;textAlign:left">
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-if="ruleForm.yiyuanxinxiPhoto" :src="ruleForm.yiyuanxinxiPhoto" mode="aspectFill">
                        </image>
                        <image  :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
                    </view>
                </view>
					<!-- text后缀 -->
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                      class="title">医院详情</view>
                <textarea :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx","height":"200rpx"}'
                          :disabled="ro.yiyuanxinxiContent" v-model="ruleForm.yiyuanxinxiContent" placeholder="医院详情"/>
            </view>

            <view class="btn">
                <button
                        :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#008761","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
                        @tap="onSubmitTap" class="bg-red">提交</button>
            </view>
        </form>

					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
                              ref="createTime" themeColor="#333333"></w-picker>


    </view>
</template>

<script>
    import wPicker from "@/components/w-picker/w-picker.vue";

    export default {
        data() {
            return {
                cross: '',
                ro:{
					username: false,
					password: false,
					yiyuanxinxiName: false,
					yiyuanxinxiTypes: false,
					yiyuanxinxiPhone: false,
					addressTypes: false,
					yiyuanxinxiPhoto: false,
					yiyuanxinxiContent: false,
					createTime: false,
        },
            ruleForm: {
					username: '',
					password: '',
					yiyuanxinxiName: '',
					yiyuanxinxiTypes: '',//数字
					yiyuanxinxiValue: '',//数字对应的值
					yiyuanxinxiPhone: '',
					addressTypes: '',//数字
					addressValue: '',//数字对应的值
					yiyuanxinxiPhoto: '',
					yiyuanxinxiContent: '',
					createTime: '',
            },
            // 登陆用户信息
            user: {},
				yiyuanxinxiTypesOptions: [],
							yiyuanxinxiTypesIndex : 0,
				addressTypesOptions: [],
							addressTypesIndex : 0,

        }
        },
        components: {
            wPicker
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
        async onLoad(options) {

		/*下拉框*/
			let yiyuanxinxiTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'yiyuanxinxi_types',
            }
			let yiyuanxinxiTypes = await this.$api.page(`dictionary`, yiyuanxinxiTypesParams);
			this.yiyuanxinxiTypesOptions = yiyuanxinxiTypes.data.list
		/*下拉框*/
			let addressTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'address_types',
            }
			let addressTypes = await this.$api.page(`dictionary`, addressTypesParams);
			this.addressTypesOptions = addressTypes.data.list


            // 如果是更新操作
            if (options.id) {
                this.ruleForm.id = options.id;
                // 获取信息
                let res = await this.$api.info(`yiyuanxinxi`, this.ruleForm.id);
                this.ruleForm = res.data;
            }
            if(options.yiyuanxinxiId){
                this.ruleForm.yiyuanxinxiId = options.yiyuanxinxiId;
            }
            // 跨表
            // this.styleChange()
        },
        methods: {
            // 下拉变化
            yiyuanxinxiTypesChange(e) {
                this.yiyuanxinxiTypesIndex = e.target.value
                this.ruleForm.yiyuanxinxiValue = this.yiyuanxinxiTypesOptions[this.yiyuanxinxiTypesIndex].indexName
                this.ruleForm.yiyuanxinxiTypes = this.yiyuanxinxiTypesOptions[this.yiyuanxinxiTypesIndex].codeIndex
            },
            addressTypesChange(e) {
                this.addressTypesIndex = e.target.value
                this.ruleForm.addressValue = this.addressTypesOptions[this.addressTypesIndex].indexName
                this.ruleForm.addressTypes = this.addressTypesOptions[this.addressTypesIndex].codeIndex
            },


            // styleChange() {
            // 	this.$nextTick(() => {
            // 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
            // 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
            // 		// })
            // 	})
            // },


			yiyuanxinxiPhotoTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.yiyuanxinxiPhoto = _this.$base.url + 'upload/' + res.file;
                    _this.$forceUpdate();
                    _this.$nextTick(() => {
                        // _this.styleChange()
                    })
                });
            },
			// 日期控件
			createTimeConfirm(val) {
                console.log(val)
                this.ruleForm.createTime = val.result;
                this.$forceUpdate();
            },




            getUUID() {
                return new Date().getTime();
            },
            async onSubmitTap() {
				if ((!this.ruleForm.username)) {
                    this.$utils.msg(`账户不能为空`);
                    return
                }
				if ((!this.ruleForm.yiyuanxinxiName)) {
                    this.$utils.msg(`医院名称不能为空`);
                    return
                }
				if ((!this.ruleForm.yiyuanxinxiPhone) && (!this.$validate.isMobile(this.ruleForm.yiyuanxinxiPhone))) {
                    this.$utils.msg(`联系方式不能为空并且需要输入正确格式`);
                    return
                }
				if ((!this.ruleForm.addressTypes)) {
                    this.$utils.msg(`地区不能为空`);
                    return
                }
				if ((!this.ruleForm.yiyuanxinxiPhoto)) {
                    this.$utils.msg(`医院图片不能为空`);
                    return
                }
                if (this.ruleForm.id) {
                    await this.$api.update(`yiyuanxinxi`, this.ruleForm);
                } else {
                    await this.$api.save(`yiyuanxinxi`, this.ruleForm);
                }
                uni.setStorageSync('pingluenStateState', true);
                this.$utils.msgBack('提交成功');
            },
            getDate(type) {
                const date = new Date();
                let year = date.getFullYear();
                let month = date.getMonth() + 1;
                let day = date.getDate();
                if (type === 'start') {
                    year = year - 60;
                } else if (type === 'end') {
                    year = year + 2;
                }
                month = month > 9 ? month : '0' + month;;
                day = day > 9 ? day : '0' + day;
                return `${year}-${month}-${day}`;
            },
            toggleTab(str) {
                this.$refs[str].show();
            }
        }
    }
</script>

<style lang="scss" scoped>
    .container {
        padding: 20upx;
    }

    .content:after {
        position: fixed;
        top: 0;
        right: 0;
        left: 0;
        bottom: 0;
        content: '';
        background-attachment: fixed;
        background-size: cover;
        background-position: center;
    }

    textarea {
        border: 1upx solid #EEEEEE;
        border-radius: 20upx;
        padding: 20upx;
    }

    .title {
        width: 180upx;
    }

    .avator {
        width: 150upx;
        height: 60upx;
    }

    .right-input {
        flex: 1;
        text-align: left;
        padding: 0 24upx;
    }

    .cu-form-group.active {
        justify-content: space-between;
    }

    .btn {
        display: flex;
        align-items: center;
        justify-content: center;
        flex-wrap: wrap;
        padding: 20upx 0;
    }

    .cu-form-group {
        padding: 0 24upx;
        background-color: transparent;
        min-height: inherit;
    }

    .cu-form-group+.cu-form-group {
        border: 0;
    }

    .cu-form-group uni-input {
        padding: 0 30upx;
    }

    .uni-input {
        padding: 0 30upx;
    }

    .cu-form-group uni-textarea {
        padding: 30upx;
        margin: 0;
    }

    .cu-form-group uni-picker::after {
        line-height: 68rpx;
    }

    .select .uni-input {
        line-height: 68rpx;
    }

    .input .right-input {
        line-height: 68rpx;
    }
</style>