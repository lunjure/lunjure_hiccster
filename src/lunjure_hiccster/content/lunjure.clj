(ns lunjure_hiccster.content.lunjure
  (:use lunjure_hiccster.core
        lunjure_hiccster.content.layout))

(defn page
  ([] (page true))
  ([dummy?]
     (layout
      {:title "(lunjure)"
       :classes ["body chatroom"]}
      [:div.inner-box 
       [:div 
        [:section#chat_window 
         [:div#text_window
          (when dummy?
            [:p "Moritz: >created team REWE"])
          [:section.input-field
           [:p {:contenteditable "true" :id "message" :name "message"}]]]]]])))
