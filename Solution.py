class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        return False 
    # increm ssi la taille du substring atteint est diviseur de la len( s) 
    # condition si != diviseur de continue  ? / break 
    


# taille  du subset doit etre divisible par rapport à len(s) 
# commencer du + petit au + grand 
# si on se retrouve a revenir a la premiere lette du mot c qu'on recommence a 
# former le subset 
# bcp de breaks 
