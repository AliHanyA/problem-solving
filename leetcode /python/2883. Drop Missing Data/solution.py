import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
   students2 = students.dropna(subset=['name']) 
   return students2
   
