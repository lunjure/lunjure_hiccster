(function($) {
  $(document).ready(function() {
    var availableTags = [
      "REWE",
      "mcDonalds",
      "Burgerking",
      "Bagel brothers",
      "Havanna",
      "Kugelfisch",
      "Ichiban",
      "Tuscolo",
      "Maredo",
      "Penny",
     ];
     $( "#message" ).autocomplete({
      source: availableTags
     });
     var newP = '<p class="status" data-time="04:30">someone created something</p>',
         scrollSection = $('#text_window .output');
     $('#testbutton').click(function(){
         scrollSection.append(newP);
         scrollSection.scrollTop(scrollSection[0].scrollHeight);
      });
  });
})(jQuery);