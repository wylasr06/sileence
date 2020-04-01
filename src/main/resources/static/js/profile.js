$(document).ready(
    function () {
        $(".releaseIssues_div").click(function () {
            console.log("stupid you ...");
            $(".edit_panel_div").show(500);
            $(".edit_panel_div").text("  ");
            $(".edit_panel_div").focus();
        });
    }
);