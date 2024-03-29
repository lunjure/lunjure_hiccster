(ns lunjure_hiccster.helpers.dummies)

(defn emoticon [name]
        [:img.emoticon {:src "/images/emoticons/smile.png"}]
  )

(defn message [user color time message]
  [:p {:data-username user 
       :data-usercolor color 
       :data-time time} 
      message])

(defn team [user time place]
  [:p.status {:data-time time} 
   (str user " has created the team " place)])

(defn join [user time place]
  [:p.status {:data-time time} 
   (str user " has joined the team " place)])

(defn list-user 
  ([user avatar]
      [:li {:class "user avatar"} 
       [:div
        [:img {:src "/images/emoticons/smile.png"}]
      user]])
  ([user]
      [:li {:class "user"} 
       [:div
        [:img {:src "/images/emoticons/smile.png"}]
      user]]))

(defn dummy-chat []
  (list
    (message "moritz" "red" "04:20" 
      (list 
        "I'm really hungry " 
        (emoticon "coffee")
        (emoticon "burger"))) 
    (team "daniel" "04:22" "Havanna, Bonn, Blablabla-str 7")
    (team "gregor" "04:22" "REWE, Bonn, Lalalaweg 9")
    (message "gerrit" "yellow" "04:24" 
      (list 
        "REWE sounds good " 
        (emoticon "blinktongue")))
    (join "gerrit" "04:24" "REWE, Bonn, Lalalaweg 9")
    (message "daniel" "orange" "04:25" "REWE? yuck") 
    (message "max" "red" "04:25"
      (list 
        "I wanna go outside and enjoy the " 
        (emoticon "sun")))
    (join "guido" "04:26" "REWE, Bonn, Lalalaweg 9")
    (join "moritz" "04:27" "Havanna, Bonn, Blablabla-str 7")))

(defn dummy-teams []
  (list
    [:ul.team
     [:li.team-name 
      [:span "Undecided"]
     [:ul.users 
      (list-user "frank")
      (list-user "jahn" "true")
      (list-user "hubert")
      (list-user "michael" "true")
      (list-user "thomas" "true")
      (list-user "natalie" "true")
      (list-user "jonas" "true")
      (list-user "tina" "true")
      (list-user "florian")
      (list-user "mike")]]]
    [:ul.team
     [:li.team-name 
     [:span {:data-lunchtime "04:20"} "Havanna"]
     [:ul.users 
      (list-user "fabian" "true")
      (list-user "hannes" "true")
      (list-user "karin" "true")
      (list-user "franco")
      (list-user "tobias" "true")
      (list-user "nathan" "true")
      (list-user "gertrud")
      (list-user "heidrun" "true")
      (list-user "daniel")
      (list-user "moritz ")]]]
    [:ul.team
     [:li.team-name 
     [:span "REWE"]
     [:ul.users 
      (list-user "jochen" "true")
      (list-user "carla" "true")
      (list-user "beate" "true")
      (list-user "alexander" "true")
      (list-user "nicole" "true")
      (list-user "richard")
      (list-user "tanja" "true")
      (list-user "ludger" "true")
      (list-user "heino" "true")
      (list-user "timo" "true")
      (list-user "gregor")
      (list-user "gerrit")
      (list-user "guido")]]]))


 