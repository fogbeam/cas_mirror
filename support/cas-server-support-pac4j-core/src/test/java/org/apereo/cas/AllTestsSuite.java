
package org.apereo.cas;

import org.apereo.cas.web.pac4j.DelegatedSessionCookieCipherExecutorTests;
import org.apereo.cas.audit.DelegatedAuthenticationAuditResourceResolverTests;
import org.apereo.cas.validation.DelegatedAuthenticationServiceTicketValidationAuthorizerTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Auto-generated by Gradle Build
 * @since 6.0.0-RC3
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    DelegatedSessionCookieCipherExecutorTests.class,
    DelegatedAuthenticationAuditResourceResolverTests.class,
    DelegatedAuthenticationServiceTicketValidationAuthorizerTests.class
})
public class AllTestsSuite {
}
