(ns aulas.aula3.confidential)

(def ^:private password-by-user
  {:Maria "1234" :Pedro "asjcjaku" :Joana "amomeupet"})

(defn- get-password
  "Get user's password by username"
  [user]
  (get password-by-user (keyword user)))