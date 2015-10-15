$(document).ready(function(){
    $(function()
    {
    	//alert('loaded')
        var updateurl = 'http://josearturodelosangeles.com/aaa/index.php/testapi/';
//        $('.changes').change(function(){
//            
//            var t =  ($(this).val())
//            var r = $(this).attr('row');
//            var c = $(this).attr('col');
//            
//            $.post(updateurl, { row: r, col: c ,val:t},function(data){
//               var lrr_row = r;
//                 tN = parseInt(t);
//                if (isNaN(tN))
//                {
//                   
//                    $('#cell_'+lrr_row+'_8').val('closed').change();
//                }
//                else
//                {
//                    $('#cell_'+lrr_row+'_8').val('299.99').change();
//                }  
//                
//                
//            });
//            
//            
//        });
        /* $('.lrr').change(function(){
            
            var t =  ($(this).val())
            var r = $(this).attr('row');
            var c = $(this).attr('col');
            
            $.post(updateurl, { row: r, col: c ,val:t})
        });*/
           
        
        $('.keylistener').keydown(function(e){
            var col =  $(this).attr("col");
            var row = $(this).attr("row");
            console.log("col"+col);
            console.log("row"+row);
            //alert($(this).val())
            switch(e.which)
            {
                case 39://right
                    var nextCol = parseInt(col);
                    if (nextCol<18)
                    nextCol++;
                    var next = '#cell_'+row+'_'+(nextCol);
                    //alert(next);
                    $(next).focus();
                break;
                 case 13:
                 case 40://down
                    var nextRow = parseInt(row);
                    if (nextRow<18)
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
                    if(nextCol>0)
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
	  $("#submit").click(function(){
		  var d1 = $('#datepicker1').val();
		  var d2 = $('#datepicker2').val();
		  alert(d1+" "+d2);
	  });
  });
    
    
});