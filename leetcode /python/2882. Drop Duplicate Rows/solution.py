import pandas as pd

def dropDuplicateEmails(customers: pd.DataFrame) -> pd.DataFrame:
    customers2 = customers.drop_duplicates(subset='email', keep='first')
    return customers2
