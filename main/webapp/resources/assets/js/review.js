/**
 * 
 */
var reviewService = (function() {

    var getList = function(param, callback, error, before, after) {
        var sno = param.sno;
        var lastRno = param.lastRno || 10000000000;
        var amount = param.amount || 10;

        console.log("getList()..");
        var url = "/reviews/pages/" + sno + "/" + lastRno + "/" + amount;

        $.ajax({
            url: url,
            type: "get",
			dataType:"json",
			beforeSend : function() {
				if(before) {
					before();
				}
			},
            success: function(result, status, xhr) {
                if(callback){
                	callback(result);
                }
                if(after) {
                	after(result);
                }
            },
            error: function(xhr, status, er) {
                if(error) error(er);
            }
        })
    }

    var remove = function(review, callback, error) {
        console.log("remove()..");

        $.ajax({
            url: "/reviews/" + review.rno,
            type: "delete",
            data: JSON.stringify(reply),
            contentType: "application/json; charset=utf-8",
            success: function(result, status, xhr) {
                if(callback) callback(result);
            },
            error: function(xhr, status, er) {
                if(error) error(xhr);
            }
        })
    }


    function displayTime(timeValue) {
        console.log("displayTime()..");
        moment.locale('ko');
        return moment(timeValue).fromNow();
    }
    
    return {
        getList: getList, 
        remove: remove,
        displayTime: displayTime
    };
})();