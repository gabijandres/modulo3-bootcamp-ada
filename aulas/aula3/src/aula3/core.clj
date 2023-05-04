(ns aula3.core
  (:require [aula3.confidential :as confidential] ))

(comment
  1 - Criar uma função que recebe um nome e retorne uma saudação
  2 - Criar uma função que, se receber um número, multiplica-o com ele mesmo, se receber dois, multiplica o primeiro com o segundo
  3 - Criar uma função que, recebe um número inteiro e multiplica com os restantes números passados
  pela função
  4 - criar uma função que retorna outra. Recebe uma mensagem de saudação onde a mensagem é usada
  na próxima função, que receberá o nome e exibirá a mensagem de saudação + nome
  5 - criar uma função privada.)

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