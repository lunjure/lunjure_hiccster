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
        [:div#text_pad 
         [:div.wrapper
         (when dummy?
          (list
          [:ul.team
           [:li.team-name "Havanna"
           [:ul.users 
            [:li.user "Daniel"]
            [:li.user "Moritz"]]]]
          [:ul.team
           [:li.team-name "REWE"
           [:ul.users 
            [:li.user "Gregor"]
            [:li.user "Guido"]
            [:li.user "Gerrit"]]]]
            ))]]
        [:section#chat_window 
         [:div#text_window
          [:div.output
          (when dummy?
           (list
            [:p {:data-username "moritz" :data-usercolor "red" :data-time "04:20"} 
             "I'm really hungry "
            [:span.emoticon {:data-emoticon "lol"}]]
            [:p {:data-username "Guido" :data-usercolor "yellow" :data-time "04:20"} 
             "does every name have to be 6 characters long? "
            [:span.emoticon {:type "blink"}]]
            [:p {:data-username "gregor" :data-usercolor "orange" :data-time "04:21"} 
             "no..duuhh "
            [:span.emoticon {:data-emoticon "wtf"}]
            [:span.emoticon {:data-emoticon "smile"}]
            [:span.emoticon {:data-emoticon "oo"}]
            [:span.emoticon {:data-emoticon "burger"}]
            [:span.emoticon {:data-emoticon "blinktongue"}]
            [:span.emoticon {:data-emoticon "coffee"}]
            [:span.emoticon {:data-emoticon "sun"}]
             " and we can also use multiple emoticons"]
            [:p.status "daniel created team Havanna "]
            [:p.status "moritz joined team Havanna "]))]
          [:section.input-field
           [:input {:type "text" :id "message" :name "message"}]]]

           ]]])))
