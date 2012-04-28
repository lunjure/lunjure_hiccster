(ns lunjure_hiccster.content.home
  (:use lunjure_hiccster.core
        lunjure_hiccster.content.layout))

(defn page []
  (let [title "(lunjure)"]
    (layout
     {:title title
      :classes ["body"]}
     [:header#main_header 
      [:h1 title]]
     [:div.inner-box 
      [:div#login_section 
       [:button {:type "button"} "login with foursquare"]]])))
