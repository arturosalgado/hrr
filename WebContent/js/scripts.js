$(document).ready(function(){
    $(function()
    {
    	//alert('loaded')
        var updateurl = site_url;
       // alert("site only "+site_url)
        //alert(updateurl);
        $('.changes').change(function(){
            
            var t =  ($(this).val())
            var update_id  = $(this).attr('update_id');
            var col  = $(this).attr('col');
            
            //alert("update id is "+update_id);
            //alert("col is "+col);
            $.post(updateurl,{value:t,'col':col,'update_id':update_id},function(data){
            	var xml = $(data);
            	  var lrr = xml.find('lrr');
            	  //alert(lrr.text())
            	  $("#LRR-"+update_id).text(lrr.text());
             
            }).done(function() {
                //alert( "second success" );
            })
            .fail(function(xhr, textStatus, errorThrown) {
                //alert(xhr.responseText+" e:"+errorThrown);
            })
              .always(function() {
                //alert( "finished" )
                });
            
        });
       
        
        $('.keylistener').keydown(function(e){
            var col =  $(this).attr("col");
            var row = $(this).attr("row");
            //console.log("col"+col);
            //console.log("row"+row);
            //alert($(this).val())
            switch(e.which)
            {
                case 39://right
                	//alert("right")
                    var nextCol = parseInt(col);
                    if (nextCol<19)
                    nextCol++;
                    var next = '#cell_'+row+'_'+(nextCol);
                   // alert(next);
                    $(next).focus();
                break;
                 case 13:
                 case 40://down
                    var nextRow = parseInt(row);
                    //alert("next is "+nextRow)
                    //alert("col iis "+col)
                    if (nextRow<1000)
                    nextRow++;
                    var next = '#cell_'+nextRow+'_'+(col);
                    //alert(next);
                    $(next).focus();
                break;
                 case 38://up
                    var nextRow = parseInt(row);
                    if (nextRow>0)
                    nextRow--;
                    var next = '#cell_'+nextRow+'_'+(col);
                    //alert(next);
                    $(next).focus();
                break;
                 case 37://left
                	 
                    var nextCol = parseInt(col);
                    //alert('left '+nextCol)
                    if(nextCol>=0)
                    nextCol--;
                    var next = '#cell_'+row+'_'+(nextCol);
                    //alert(next);
                    $(next).focus();
                break;
                
            }
           
        });
        
});
    
  // trigger the click from the calendar icon   
  $(function(){
	  
	  $('#mXDP7-btn').click(function(){
		  $('#datepicker1').trigger();
	  });
	  
  });  
    
  $(function() {
      $("#datepicker1").datepicker();
      $("#datepicker2").datepicker();
  });
  
  $(function(){
	  $("#dateForm").submit(function(){
		  var d1 = $('#datepicker1').val();
		  var d2 = $('#datepicker2').val();
		 // alert(d1+" iiii "+d2);
		  if (d1=="" || d2=="")
			  {
			  	alert("Date cannot be empty")
			  	return false;
			  }
	  });
  });
  
  
  
    
    
});

$(document).ready(function(){
	
	$("#calendar-icon-1").click(function(){
		$("#datepicker2").datepicker("show");
	});
	
	$("#calendar-icon-2").click(function(){
		$("#datepicker1").datepicker("show");
	});
	
});
