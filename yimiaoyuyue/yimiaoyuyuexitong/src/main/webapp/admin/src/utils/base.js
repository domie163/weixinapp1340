const base = {
    get() {
        return {
            url : "http://localhost:8080/yimiaoyuyuexitong/",
            name: "yimiaoyuyuexitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yimiaoyuyuexitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "疫苗预约网站系统"
        } 
    }
}
export default base
