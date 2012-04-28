(ns lunjure_hiccster.content.home
  (:use lunjure_hiccster.core
        lunjure_hiccster.content.layout))

(defn page []
  (let [title "(lunjure)"]
    (layout
     {:title title
      :classes ["body"]}
     [:div.inner-box 
      [:div#login_section 
       [:button {:type "button"} "login with foursquare"]]])))
