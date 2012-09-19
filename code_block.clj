(do
  (println "h1")
  (apply * [4 5 6]))

; h1
;= 120

; do evaluates all of the expressions provided to it in order and yeilds the las;t expression's value as its value.

;The values of all but the last expression are discarded, although their side ef;fects do occur(such as printing to standard out as we're doing here)
