(function($) {
  'use strict';

  $(function() {
/*
    var $fullText = $('.admin-fullText');
    $('#admin-fullscreen').on('click', function() {
      $.AMUI.fullscreen.toggle();
    });

    $(document).on($.AMUI.fullscreen.raw.fullscreenchange, function() {
      $fullText.text($.AMUI.fullscreen.isFullscreen ? '退出全屏' : '开启全屏');
    });
*/
    
    
    $('.menu-item-has-children').click(function(){
	 	$(this).toggleClass("active");
	 	$('.menu-item-has-children').not(this).removeClass("active");
    });
    
    $(document).ready(function(){
	   var mshiziH = $(".mshizi").width(); 
	   $(".mshizi").height(mshiziH); 
	   $("table").addClass("am-table  am-table-bordered am-table-compact");
    });
  });
})(jQuery);
