(ns sexpbot.plugins.8ball
  (:use [sexpbot.respond]
	[sexpbot.commands]))

(def eball-cmds {"8ball" :8ball})

(def responses
     ["As I see it, yes."
      "It is certain."
      "It is decidedly so."
      "Most likely." 
      "Outlook good." 
      "Signs point to yes."
      "Without a doubt." 
      "Yes."
      "Yes - definitely."
      "You may rely on it." 
      "Reply hazy, try again."
      "Ask again later."
      "Better not tell you now."
      "Cannot predict now."
      "Concentrate and ask again."
      "Don't count on it."
      "My reply is no."
      "My sources say no."
      "Outlook not so good."
      "Very doubtful."])

(defmethod respond :8ball [{:keys [args bot sender channel]}]
  (let [answer (rand-int 20)]
    (.sendMessage bot channel (str sender ": " (nth responses answer)))))

(defmodule eball-cmds :8ball)