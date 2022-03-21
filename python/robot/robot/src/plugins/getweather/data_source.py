import requests
import json

class getweather:
    def get(self,city):
        url="http://apis.juhe.cn/simpleWeather/query?city="
        key="8142d1115dade9714a3837d51cdcc418"
        re=requests.get(url+city+"&key="+key)
        rejson=json.loads(re.text)
        reason=rejson["reason"]
        result=rejson["result"]
        realtime=result["realtime"]
        now=[realtime["info"],realtime["temperature"],realtime["direct"],realtime["power"]]
        future=result["future"]
        todayjs=future[0]
        today=[todayjs["date"],todayjs["temperature"],todayjs["weather"],todayjs["direct"]]
        tomorrowjs=future[1]
        tomorrow = [tomorrowjs["date"], tomorrowjs["temperature"], tomorrowjs["weather"], tomorrowjs["direct"]]
        allweather=[now,today,tomorrow]
        return allweather
