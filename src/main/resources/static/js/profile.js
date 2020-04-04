$(document).ready(
    function () {
        $(".releaseIssues_div_icon").click(function () {
            console.log("stupid you ...");
            $(".edit_panel_div").show();
            //$(".issuePicture_div").show();
            $(".releaseIssue_div").show();
            $(".addPicture_div").show();
            $(".edit_panel_div").text("  ");
            $(".edit_panel_div").focus();
            $(".releaseHistory_div").css("margin-top","10px");
        });

        $(".addPicture_div").click(function () {
            console.log("stupid fucking guy...")
            $(".issuePicture_div").show();
        });

        $(".releaseIssue_div").click(function () {
            console.log($(".edit_panel_div").html()+" I am here with you");
        });
        /**文件上传和预览*/
        let readURL = function(input) {
            if (input.files && input.files[0]) {
                let reader = new FileReader();
                reader.onload = function (e) {
                    $('.profile-pic').attr('src', e.target.result);
                    $('.profile-pic').css('display','block');
                }
                reader.readAsDataURL(input.files[0]);
            }
        }
        $(".file-upload").on('change', function(){
            readURL(this);
        });
        $(".upload-button").on('click', function() {
            $(".file-upload").click();
        });
        /**文件上传和预览*/
    }
);
