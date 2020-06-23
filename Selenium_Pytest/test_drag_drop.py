import pytest
import time
from selenium.webdriver.common.action_chains import ActionChains


def test_dragdrop_check(test_dragdrop,test_common):
    test_common[0].maximize_window()
    test_common[0].switch_to.frame(test_common[0].find_element_by_xpath("//iframe[@class='demo-frame']"))
    a1=test_common[0].find_element_by_xpath("//li[contains(text(),'Item 4')]")
    a2=test_common[0].find_element_by_xpath("//li[contains(text(),'Item 2')]")

    action=ActionChains(test_common[0])
    time.sleep(2)
    action.drag_and_drop(a1,a2).perform()

    time.sleep(2)
    test_common[0].close()
