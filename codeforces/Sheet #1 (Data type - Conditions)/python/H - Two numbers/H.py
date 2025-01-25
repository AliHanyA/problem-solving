import math
 
def custom_round(x):
    if x - math.floor(x) >= 0.5:
        return math.ceil(x)
    else:
        return math.floor(x)
 
A, B = map(float, input().split())
 
floor_result = math.floor(A / B)
ceil_result = math.ceil(A / B)
round_result = custom_round(A / B)
 
print(f"floor {int(A)} / {int(B)} = {floor_result}")
print(f"ceil {int(A)} / {int(B)} = {ceil_result}")
print(f"round {int(A)} / {int(B)} = {round_result}")
