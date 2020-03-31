
function login() {
    console.log(" function login(): 用户名："+$("#username_input").val()+", 密码："+$("#password_input").val())
    $.post("/login",{
        name:$("#username_input").val(),
        password:$("#password_input").val()
    },
    function (data,status) {
        console.log("function login(): data : "+data+", status : "+status);
        if(status == "success"){
            window.location.href = "/news";
        }
    });
}
function register() {

}