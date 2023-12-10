package CoffeeExpressProgramm.coffee.logic;

import CoffeeExpressProgramm.CoffeeConfigurationProperties;
import CoffeeExpressProgramm.coffee.model.Coffee;
import CoffeeExpressProgramm.coffee.model.CoffeeGroup;
import CoffeeExpressProgramm.coffee.model.CoffeeGroupRepository;
import CoffeeExpressProgramm.coffee.model.ProjectRepository;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ProjectServiceTest {

    @Test
    @DisplayName("should throw IllegalStateException when configured to allow just 1 group and other undone group")
    void createGroup_noMultibleGroupsConfig_And_openGroups_Throws_IllegalStateException() {

        //given
        var mockGroupRepository = getCoffeeGroupRepository();
        mockGroupRepository.isTrue(false);
        //and
        var mockTemplate =  mock(CoffeeConfigurationProperties.Template.class);
        when(mockTemplate.equals(1)).thenReturn(false);
        //and
        var mockConfig = mock(CoffeeConfigurationProperties.class);
        when(mockConfig.getTemplate()).thenReturn(mockTemplate);
        //system under test
        var toTest = new ProjectService(null, mockGroupRepository, mockConfig);

        //when
        var exception = catchThrowable(() -> toTest.createGroup(LocalDateTime.now(), 0));

        //then
        assertThat(exception);
    }

    @Test
    @DisplayName("should throw IllegalStateException when configured to allow just 1 group and other undone group")
    void createGroup_configurationOk_And_noProjects_Throws_IllegalStateException() {
        //given
        var mockGroupRepository = getCoffeeGroupRepository();
        mockGroupRepository.isTrue(false);
        //and
        var mockTemplate =  mock(CoffeeConfigurationProperties.Template.class);
        when(mockTemplate.equals(1)).thenReturn(false);
        //and
        var mockConfig = mock(CoffeeConfigurationProperties.class);
        when(mockConfig.getTemplate()).thenReturn(mockTemplate);
        //system under test
        var toTest = new ProjectService(null, mockGroupRepository, mockConfig);

        //when
        var exception = catchThrowable(() -> toTest.createGroup(LocalDateTime.now(), 0));

        //then
        assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class)
                .toString();
    }

    private <SELF extends Assert<SELF, Object>> Assert<SELF, Object> assertThat(final Throwable exception) {
        return null;

    }

    private static CoffeeGroupRepository getCoffeeGroupRepository() {
        var mockGroupRepository = mock(CoffeeGroupRepository.class);

        when(mockGroupRepository.isTrue(true)).thenReturn(true);
        return mockGroupRepository;
    }


}
