(ns aulas.aula3.main
  (:require [aulas.aula3.confidential :as confidential] ))

(defn salutation
  "Create salutation with some name"
  [name]
  (str "Bem vindo " name))

(defn multiply
  "Multiply two numbers"
  ([num1]
   (multiply num1 num1))
  ([num1 num2]
   (* num1 num2)))

(defn multiply-reduce
  "Receive some int and multiply it by the rest of the numbers list. Return a value of all numbers multiplied."
  [num & rest-nums]
  (reduce #(* %1 %2) num rest-nums))

(defn multiply-map
  "Receive some int and multiply it by the rest of the numbers list. Return the list with each number multiplied by num"
  [num & rest-nums]
  (map #(* % num) rest-nums))

(defn create-salutation
  "Return a salutation function"
  [salutation]
  (fn [name]
    (str salutation " " name)))

; This function and symbol are private, so this following code must generate an error
; (confidential/get-password "Maria")
; (confidential/password-by-user)