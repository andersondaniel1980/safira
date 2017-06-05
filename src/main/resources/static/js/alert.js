$(document).ready( function () {

	alert("Executando funções de css do formulário");
	
	$('.form-control').each(function(){
		$(this).css("border", "1px solid #003399");

		if($(this).val() != ''){
		   $(this).css("background-color", "#FFFF99");
		   $(this).css("color", "#000");
		 }
	});
	
	
	$('.form-control').blur(function() {
		if($(this).val() != '') {
		   $(this).css("background-color", "#FFFF99");
		   $(this).css("color", "#000");
		}
		
		if($(this).val() == '') {
		   $(this).css("background-color", "white");
		   $(this).css("color", "#666");
		 }		
	});
	
	

});