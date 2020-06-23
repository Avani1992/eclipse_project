import pytest
import time

def test_hidden_division_popup(test_hidden_popup,test_common):
    test_common[0].maximize_window()
    test_common[0].find_element_by_xpath("//input[@id='DepartDate']").click()

    time.sleep(2)
    test_common[0].find_element_by_xpath("//div[@class='monthBlock last']//a[contains(@class,'ui-state-default')][contains(text(),'17')]").click()
    time.sleep(3)
    test_common[0].close()