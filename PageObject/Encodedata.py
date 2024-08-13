import  base64

def encode(String):
  return base64.b64encode(String.encode())

def decode(String):
   return base64.b64decode(String.decode()).decode()

def  dec(bytes):
    return base64.b64decode(bytes.encode()).decode()