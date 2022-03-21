from pathlib import Path
from nonebot import on_keyword
from nonebot.rule import to_me
from nonebot.typing import T_State
from nonebot.adapters import Bot,Event
# import nonebot
from .data_source import theJoke
from nonebot import get_driver

from .config import Config

global_config = get_driver().config
config = Config(**global_config.dict())

randJoke=on_keyword("笑话",rule=to_me(),priority=5)


@randJoke.handle()
async def returnJoke(bot:Bot,event:Event,state:T_State):
    thejoke=theJoke()
    randjoke=thejoke.getrandomjoke()
    await randJoke.finish(randjoke)

# Export something for other plugin
# export = nonebot.export()
# export.foo = "bar"

# @export.xxx
# def some_function():

