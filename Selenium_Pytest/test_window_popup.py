import pytest
import  time


def test_window_popup(test_window_popup,test_common):
    li=test_common[0].current_window_handle
    alllinks=test_common[0].get_window_position(li)
    size=len(alllinks)
    print(size)
    for data in alllinks:
         text=test_common[0].switch_to_window(data).title
    print(li)




    time.sleep(2)
    test_common[0].close()