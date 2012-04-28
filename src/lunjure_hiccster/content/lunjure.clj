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
           (list
            [:p {:data-username "moritz" :data-usercolor "red"} 
             "I'm really hungry "
            [:span.emoticon {:data-emoticon "lol"}]]
            [:p {:data-username "gregor" :data-usercolor "orange"} 
             "duuhh "
            [:span.emoticon {:data-emoticon "wtf"}]
            [:span.emoticon {:data-emoticon "smile"}]
            [:span.emoticon {:data-emoticon "oo"}]
            [:span.emoticon {:data-emoticon "burger"}]
            [:span.emoticon {:data-emoticon "blinktongue"}]
            [:span.emoticon {:data-emoticon "coffee"}]
            [:span.emoticon {:data-emoticon "sun"}]
             " me too"]
            [:p {:data-username "daniel" :data-usercolor "yellow"} "created team Havanna "]))
          [:section.input-field
           [:input {:type "text" :id "message" :name "message"}]]]]]])))
