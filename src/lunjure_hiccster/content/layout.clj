(ns lunjure_hiccster.content.layout
  (:use hiccup.page)
  (:require [clojure.string :as str]))

(defn- classes->string [classes]
  (->> (map name classes)
       (str/join " ")))


(defn path [p]
  (str "/" p))


(defn layout [meta & content]
  (let [{:keys [title classes]} meta]
    (html5 {:lang "de"}
     [:head
      [:title title]
      [:meta {:charset "utf-8"}]
      [:link {:href (path "images/favicon.ico") :rel "shortcut icon" :type "image/x-icon"}]
      [:link {:href (path "css/main.css") :rel "stylesheet" :type "text/css"}]
      "<!--[if lt IE 9]>"
      [:script {:src "//html5shiv.googlecode.com/svn/trunk/html5.js"}]
      "<![endif]-->"]
     [:body {:class (classes->string classes) }
      [:div#main_wrapper
       [:div#content.content-wrapper
        content]
      [:footer#bottom_navigation
       [:nav
        [:ul
         [:li
          [:a {:href "lunjure_hiccster.content.impressum"} "Impressum"]]]]]]])))

