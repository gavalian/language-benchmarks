      PROGRAM PIMC
      INTEGER*4 J,I,nThrow,nSuccess,N
      REAL time
      REAL Value
      REAL PI
      REAL X,Y
      i = 760013
      N = 100000000
      nThrow = 0
      nSuccess = 0
      do j = 1,N 
         X = RAN()
         Y = RAN()
         nThrow = nThrow + 1
C-         Write(*,*)' X = ',X, ' Y = ',Y,' value = ',X*X+Y*Y
         if((X*X+Y*Y).LT.1.0) THEN
            nSuccess = nSuccess + 1
         end if
      end do
      PI = 4.0*REAL(nSuccess)/REAL(nThrow)
      Write(*,*)" throw = ",nThrow, " success = ",nSuccess
      Write(*,*)" FORTRAN : pi = ",PI," time = ",time
      END
