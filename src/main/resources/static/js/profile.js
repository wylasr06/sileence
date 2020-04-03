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

        /*$(".releaseIssue_div").click(function () {
            console.log("stupid fucking guy...")
            $(".issuePicture_div").show();
        });*/
    }
);
$(document).ready(
    function () {
        $(".releaseIssue_div").click(function () {
            console.log("stupid fucking guy...")
            $(".issuePicture_div").show();
        });
    }
);