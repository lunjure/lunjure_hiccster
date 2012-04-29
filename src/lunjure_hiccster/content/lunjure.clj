(ns lunjure_hiccster.content.lunjure
  (:use lunjure_hiccster.core
        lunjure_hiccster.helpers.dummies
        lunjure_hiccster.content.layout))

(defn page
  ([] (page true))
  ([dummy?]
    (let [title "(lunjure)"]
      (layout
       {:title title
        :dummy? dummy?
        :classes ["body chatroom"]}
       [:header#chat_title 
        [:h1 title]
         [:div#roomname "the lunjure crew"]] 
       [:div.inner-box 
       (when dummy?
       [:button#testbutton {:type "button"} "add line"])
        [:div 
         [:div#text_pad 
          [:div.wrapper
          (when dummy?
            (dummy-teams))]]
         [:section#chat_window 
          [:button#logout {:type "button"} "Logout"]
          [:div#text_window
           [:div.output
           (when dummy?
             (dummy-chat))]
           [:section.input-field
            [:input {:type "text" :id "message" :name "message"}]]]]]]))))
