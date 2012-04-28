(function($) {
    $(document).ready(function() {
      var availableTags = [
        "ActionScript",
        "AppleScript",
        "Asp",
        "BASIC",
        "C",
        "C++",
        "Clojure",
        "COBOL",
        "ColdFusion",
        "Erlang",
        "Fortran",
        "Groovy",
        "Haskell",
        "Java",
        "JavaScript",
        "Lisp",
        "Perl",
        "PHP",
        "Python",
        "Ruby",
        "Scala",
        "Scheme"
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