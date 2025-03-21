
<template>
    <view class="content">
        <form class="app-update-pv">
                 <view
                         :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                         class="cu-form-group">
                     <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                           class="title">疫苗名称</view>
                     <input   disabled
                              :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                              :disabled="ro.yimiaoName" v-model="yimiao.yimiaoName" placeholder="疫苗名称"></input>
                 </view>
                <view
                        :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">疫苗类型</view>
                    <input disabled
                           :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                           :disabled="ro.yimiaoValue"
                           v-model="yimiao.yimiaoValue"
                           placeholder="疫苗类型"></input>
                </view>
                <view
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">疫苗图片</view>
                    <view class="right-input" style="padding:0;textAlign:left">
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-if="yimiao.yimiaoPhoto" :src="yimiao.yimiaoPhoto" mode="aspectFill">
                        </image>
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
                    </view>
                </view>
							                 <view
                         :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                         class="cu-form-group">
                     <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                           class="title">剩余数量</view>
                     <input   disabled
                              :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                              :disabled="ro.yimiaoKucunNumber" v-model="yimiao.yimiaoKucunNumber" placeholder="剩余数量"></input>
                 </view>
                 <view
                         :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                         class="cu-form-group">
                     <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                           class="title">适宜接种人群</view>
                     <input   disabled
                              :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                              :disabled="ro.yimiaoRenqun" v-model="yimiao.yimiaoRenqun" placeholder="适宜接种人群"></input>
                 </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                      class="title">订单号</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.yimiaoOrderUuidNumber" type="text" v-model="ruleForm.yimiaoOrderUuidNumber" placeholder="订单号"></input>
            </view>
                <!-- 级联表的表id -->
                <input type="hidden" :value="yimiao.id" id="yimiaoId" name="yimiaoId"/>
                <view
                        :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">预约数量</view>
                    <input   disabled
                             :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                             :disabled="ro.buyNumber" type="number" v-model="ruleForm.buyNumber" placeholder="预约数量"></input>
                </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">订单类型</view>
                    <picker @change="yimiaoOrderTypesChange" :value="yimiaoOrderTypesIndex" :range="yimiaoOrderTypesOptions" range-key="indexName">
                        <view
                                :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.yimiaoOrderTypes?ruleForm.yimiaoOrderValue:"请选择订单类型"}}</view>
                    </picker>
                </view>

            <view class="btn">
                <button
                        :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#008761","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
                        @tap="onSubmitTap" class="bg-red">提交</button>
            </view>
        </form>

					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="insertTimeConfirm"
                              ref="insertTime" themeColor="#333333"></w-picker>
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
					yimiaoOrderUuidNumber: true,
					yimiaoId: false,
					yonghuId: false,
					buyNumber: true,
					yimiaoOrderTruePrice: false,
					yimiaoOrderTypes: false,
					insertTime: false,
					createTime: false,
        },
            ruleForm: {
					yimiaoOrderUuidNumber: this.getUUID(),//数字
					yimiaoId: '',
					yonghuId: '',
					buyNumber: '',
					yimiaoOrderTruePrice: '',
					yimiaoOrderTypes: '',//数字
					yimiaoOrderValue: '',//数字对应的值
					insertTime: '',
					createTime: '',
            },
            // 登陆用户信息
            user: {},
				yimiaoOrderTypesOptions: [],
							yimiaoOrderTypesIndex : 0,

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
			let yimiaoOrderTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'yimiao_order_types',
            }
			let yimiaoOrderTypes = await this.$api.page(`dictionary`, yimiaoOrderTypesParams);
			this.yimiaoOrderTypesOptions = yimiaoOrderTypes.data.list


            // 如果是更新操作
            if (options.id) {
                this.ruleForm.id = options.id;
                // 获取信息
                let res = await this.$api.info(`yimiaoOrder`, this.ruleForm.id);
                this.ruleForm = res.data;
            }
            if(options.yimiaoOrderId){
                this.ruleForm.yimiaoOrderId = options.yimiaoOrderId;
            }
            // 跨表
            // this.styleChange()
        },
        methods: {
            // 下拉变化
            yimiaoOrderTypesChange(e) {
                this.yimiaoOrderTypesIndex = e.target.value
                this.ruleForm.yimiaoOrderValue = this.yimiaoOrderTypesOptions[this.yimiaoOrderTypesIndex].indexName
                this.ruleForm.yimiaoOrderTypes = this.yimiaoOrderTypesOptions[this.yimiaoOrderTypesIndex].codeIndex
            },


            // styleChange() {
            // 	this.$nextTick(() => {
            // 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
            // 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
            // 		// })
            // 	})
            // },


			// 日期控件
			insertTimeConfirm(val) {
                console.log(val)
                this.ruleForm.insertTime = val.result;
                this.$forceUpdate();
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
				if ((!this.ruleForm.yimiaoOrderUuidNumber)) {
                    this.$utils.msg(`订单号不能为空`);
                    return
                }
				if ((!this.ruleForm.buyNumber) && (!this.$validate.isIntNumer(this.ruleForm.buyNumber)) && this.ruleForm.buyNumber >0) {
                    this.$utils.msg(`预约数量不能为空，不能小于0 格式为数字`);
                    return
                }
                if (this.ruleForm.id) {
                    await this.$api.update(`yimiaoOrder`, this.ruleForm);
                } else {
                    await this.$api.save(`yimiaoOrder`, this.ruleForm);
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