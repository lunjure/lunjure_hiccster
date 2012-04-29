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
      (list-user "max")
      (list-user "fabian" "true")
      (list-user "fabian" "true")
      (list-user "fabian" "true")
      (list-user "fabian" "true")
      (list-user "fabian" "true")
      (list-user "fabian" "true")
      (list-user "steffen")
      (list-user "thisnameisreallylong")
      (list-user "florian")
      (list-user "mike")]]]
    [:ul.team
     [:li.team-name 
     [:span {:data-lunchtime "04:20"} "Havanna"]
     [:ul.users 
      (list-user "daniel")
      (list-user "moritz heidkamp")]]]
    [:ul.team
     [:li.team-name 
     [:span "REWE"]
     [:ul.users 
      (list-user "gregor")
      (list-user "gerrit")
      (list-user "guido")]]]))


 