import pytest
import time

def test_scrollpage(test_url,test_common):
    test_common[0].maximize_window()
    time.sleep(1)
    test_common[0].execute_script("window.scrollTo(0,800)")
    time.sleep(4)
    test_common[0].close()