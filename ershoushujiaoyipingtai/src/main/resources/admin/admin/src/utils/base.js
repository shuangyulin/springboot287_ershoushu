const base = {
    get() {
        return {
            url : "http://localhost:8080/ershoushujiaoyipingtai/",
            name: "ershoushujiaoyipingtai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ershoushujiaoyipingtai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园二手书交易平台"
        } 
    }
}
export default base
