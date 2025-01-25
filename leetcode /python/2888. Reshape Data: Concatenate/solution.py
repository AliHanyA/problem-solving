import pandas as pd

def concatenateTables(df1: pd.DataFrame, df2: pd.DataFrame) -> pd.DataFrame:
    data1 = pd.DataFrame(df1) 
    data2 = pd.DataFrame(df2)
    result = pd.concat([data1, data2], ignore_index=True)
    return result
