(ns lunjure_hiccster.content.lunjure
  (:use lunjure_hiccster.core
        lunjure_hiccster.content.layout))
(defn dummy-chat []
  (list
    [:p {:data-username "moritz" :data-usercolor "red" :data-time "04:20"} 
     "I'm really hungry "
    [:span.emoticon {:data-emoticon "lol"}]]
    [:p {:data-username "guido" :data-usercolor "yellow" :data-time "04:20"} 
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
    [:p.status {:data-time "04:22"} "daniel created team Havanna "]
    [:p.status {:data-time "04:22"} "moritz joined team Havanna "]
    [:p {:data-username "moritz" :data-usercolor "red" :data-time "04:23"} 
     "stop spamming... let's go "
    [:span.emoticon {:data-emoticon "sad"}]]
    [:p.status {:data-time "04:24"} "gregor created team REWE"]
    [:p.status {:data-time "04:24"} "gerrit joined team REWE"]
    [:p.status {:data-time "04:25"} "guido joined team REWE"]))

(defn dummy-teams []
  (list
    [:ul.team
     [:li.team-name 
      [:span "Undecided"]
     [:ul.users 
      [:li.user 
       [:div
        [:img {:src "/images/avatar.png"}]
      "moritz u."]]
      [:li.user 
       [:div
        [:img {:src "/images/avatar.png"}]
      "markus"]]
      [:li.user 
       [:div
        [:img {:src "/images/avatar.png"}]
      "fabian"]]
      [:li.user 
       [:div
        [:img {:src "/images/avatar.png"}]
      "florian"]]
      [:li.user 
       [:div
        [:img {:src "/images/avatar.png"}]
      "mike"]]
      [:li.user 
       [:div
        [:img {:src "/images/avatar.png"}]
      "max"]]
      [:li.user 
       [:div
        [:img {:src "/images/avatar.png"}]
      "steffen"]]]]]
    [:ul.team
     [:li.team-name 
     [:span "Havanna"]
     [:ul.users 
      [:li.user 
       [:div
        [:img {:src "/images/avatar.png"}]
      "daniel"]]
      [:li.user 
       [:div
        [:img {:src "/images/avatar.png"}]
      "moritz"]]]]]
    [:ul.team
     [:li.team-name 
     [:span "REWE"]
     [:ul.users 
      [:li.user 
       [:div
        [:img {:src "/images/avatar.png"}]
      "Gregor"]]
      [:li.user 
       [:div
        [:img {:src "/images/avatar.png"}]
      "gerrit"]]
      [:li.user 
       [:div
        [:img {:src "/images/avatar.png"}]
      "guido"]]]]]
      ))

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
       [:div 
        [:div#text_pad 
         [:div.wrapper
         (when dummy?
           (dummy-teams))]]
        [:section#chat_window 
         [:div#text_window
          [:div.output
          (when dummy?
            (dummy-chat))]
          [:section.input-field
           [:input {:type "text" :id "message" :name "message"}]]]]]]))))
