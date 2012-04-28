(ns lunjure_hiccster.content.lunjure
  (:use lunjure_hiccster.core
        lunjure_hiccster.content.layout))

(defn page []
  (let [title "(lunjure)"]
    (layout
     {:title title
      :classes ["body"]}
     [:div.inner-box 
      [:div 
       [:section#chat_window 
        [:div#output_window 
         [:p "Moritz: >created team REWE"]]
        [:div#input_window ""]]]])))
