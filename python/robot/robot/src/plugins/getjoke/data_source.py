import requests
import json

class theJoke:
    def getrandomjoke(self):
        url="http://v.juhe.cn/joke/randJoke.php?key="
        key="156c6b8614459e043fa4b8365d797180"
        re=requests.get(url+key)
        rejson=json.loads(re.text)
        return rejson["result"][0]["content"]
