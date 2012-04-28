(ns lunjure_hiccster.content.layout
  (:use hiccup.page)
  (:require [clojure.string :as str]))

(defn- classes->string [classes]
  (->> (map name classes)
       (str/join " ")))


(defn path [p]
  (str "/" p))


(defn layout [meta & content]
  (let [{:keys [title classes dummy?]} meta]
    (html5 {:lang "de"}
     [:head
      [:title title]
      [:meta {:charset "utf-8"}]
      [:link {:href (path "images/favicon.ico") :rel "shortcut icon" :type "image/x-icon"}]
      [:link {:href (path "css/main.css") :rel "stylesheet" :type "text/css"}]
      [:script {:src "/jquery-1.7.2.min.js"}]
      [:script {:src "/jquery-ui-1.8.19.custom.min.js"}]
      (when dummy? [:script {:src "js/greg.js"}])]
     [:body {:class (classes->string classes) }
      [:div#main_wrapper
       [:div#content.content-wrapper
        content]
      [:footer#bottom_navigation
       [:nav
        [:ul
         [:li
          [:a {:href "lunjure_hiccster.content.impressum"} "impressum/imprint"]]
         [:li
          [:a {:href "lunjure_hiccster.content.faq"} "faq"]]
         [:li
          [:a {:href "lunjure_hiccster.content.about"} "about"]]
          ]]]]
      (when-not dummy?
        [:script {:src "/lunjure.js"}])])))
