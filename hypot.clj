(defn hypot [x y]
 (let [x2 (* x x)
  	   y2 (* y y)]
  (Math/sqrt (+ x2 y2))))

; (hypot 10 10)
;= (Math/sqrt (+ 100 100))
;= 14.142135623730951
