const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm4pg65/",
            name: "ssm4pg65",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm4pg65/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "远程家庭健康监测管理系统"
        } 
    }
}
export default base
