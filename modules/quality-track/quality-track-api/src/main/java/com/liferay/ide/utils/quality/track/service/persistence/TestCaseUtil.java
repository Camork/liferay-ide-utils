/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.ide.utils.quality.track.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.ide.utils.quality.track.model.TestCase;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the test case service. This utility wraps {@link com.liferay.ide.utils.quality.track.service.persistence.impl.TestCasePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Terry Jia
 * @see TestCasePersistence
 * @see com.liferay.ide.utils.quality.track.service.persistence.impl.TestCasePersistenceImpl
 * @generated
 */
@ProviderType
public class TestCaseUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(TestCase testCase) {
		getPersistence().clearCache(testCase);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TestCase> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TestCase> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TestCase> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TestCase> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TestCase update(TestCase testCase) {
		return getPersistence().update(testCase);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TestCase update(TestCase testCase,
		ServiceContext serviceContext) {
		return getPersistence().update(testCase, serviceContext);
	}

	/**
	* Caches the test case in the entity cache if it is enabled.
	*
	* @param testCase the test case
	*/
	public static void cacheResult(TestCase testCase) {
		getPersistence().cacheResult(testCase);
	}

	/**
	* Caches the test cases in the entity cache if it is enabled.
	*
	* @param testCases the test cases
	*/
	public static void cacheResult(List<TestCase> testCases) {
		getPersistence().cacheResult(testCases);
	}

	/**
	* Creates a new test case with the primary key. Does not add the test case to the database.
	*
	* @param testCaseId the primary key for the new test case
	* @return the new test case
	*/
	public static TestCase create(long testCaseId) {
		return getPersistence().create(testCaseId);
	}

	/**
	* Removes the test case with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testCaseId the primary key of the test case
	* @return the test case that was removed
	* @throws NoSuchTestCaseException if a test case with the primary key could not be found
	*/
	public static TestCase remove(long testCaseId)
		throws com.liferay.ide.utils.quality.track.exception.NoSuchTestCaseException {
		return getPersistence().remove(testCaseId);
	}

	public static TestCase updateImpl(TestCase testCase) {
		return getPersistence().updateImpl(testCase);
	}

	/**
	* Returns the test case with the primary key or throws a {@link NoSuchTestCaseException} if it could not be found.
	*
	* @param testCaseId the primary key of the test case
	* @return the test case
	* @throws NoSuchTestCaseException if a test case with the primary key could not be found
	*/
	public static TestCase findByPrimaryKey(long testCaseId)
		throws com.liferay.ide.utils.quality.track.exception.NoSuchTestCaseException {
		return getPersistence().findByPrimaryKey(testCaseId);
	}

	/**
	* Returns the test case with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param testCaseId the primary key of the test case
	* @return the test case, or <code>null</code> if a test case with the primary key could not be found
	*/
	public static TestCase fetchByPrimaryKey(long testCaseId) {
		return getPersistence().fetchByPrimaryKey(testCaseId);
	}

	public static java.util.Map<java.io.Serializable, TestCase> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the test cases.
	*
	* @return the test cases
	*/
	public static List<TestCase> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the test cases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestCaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test cases
	* @param end the upper bound of the range of test cases (not inclusive)
	* @return the range of test cases
	*/
	public static List<TestCase> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the test cases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestCaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test cases
	* @param end the upper bound of the range of test cases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of test cases
	*/
	public static List<TestCase> findAll(int start, int end,
		OrderByComparator<TestCase> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test cases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestCaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test cases
	* @param end the upper bound of the range of test cases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of test cases
	*/
	public static List<TestCase> findAll(int start, int end,
		OrderByComparator<TestCase> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the test cases from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of test cases.
	*
	* @return the number of test cases
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	/**
	* Returns the primaryKeys of releases associated with the test case.
	*
	* @param pk the primary key of the test case
	* @return long[] of the primaryKeys of releases associated with the test case
	*/
	public static long[] getReleasePrimaryKeys(long pk) {
		return getPersistence().getReleasePrimaryKeys(pk);
	}

	/**
	* Returns all the releases associated with the test case.
	*
	* @param pk the primary key of the test case
	* @return the releases associated with the test case
	*/
	public static List<com.liferay.ide.utils.quality.track.model.Release> getReleases(
		long pk) {
		return getPersistence().getReleases(pk);
	}

	/**
	* Returns a range of all the releases associated with the test case.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestCaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the test case
	* @param start the lower bound of the range of test cases
	* @param end the upper bound of the range of test cases (not inclusive)
	* @return the range of releases associated with the test case
	*/
	public static List<com.liferay.ide.utils.quality.track.model.Release> getReleases(
		long pk, int start, int end) {
		return getPersistence().getReleases(pk, start, end);
	}

	/**
	* Returns an ordered range of all the releases associated with the test case.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestCaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the test case
	* @param start the lower bound of the range of test cases
	* @param end the upper bound of the range of test cases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of releases associated with the test case
	*/
	public static List<com.liferay.ide.utils.quality.track.model.Release> getReleases(
		long pk, int start, int end,
		OrderByComparator<com.liferay.ide.utils.quality.track.model.Release> orderByComparator) {
		return getPersistence().getReleases(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of releases associated with the test case.
	*
	* @param pk the primary key of the test case
	* @return the number of releases associated with the test case
	*/
	public static int getReleasesSize(long pk) {
		return getPersistence().getReleasesSize(pk);
	}

	/**
	* Returns <code>true</code> if the release is associated with the test case.
	*
	* @param pk the primary key of the test case
	* @param releasePK the primary key of the release
	* @return <code>true</code> if the release is associated with the test case; <code>false</code> otherwise
	*/
	public static boolean containsRelease(long pk, long releasePK) {
		return getPersistence().containsRelease(pk, releasePK);
	}

	/**
	* Returns <code>true</code> if the test case has any releases associated with it.
	*
	* @param pk the primary key of the test case to check for associations with releases
	* @return <code>true</code> if the test case has any releases associated with it; <code>false</code> otherwise
	*/
	public static boolean containsReleases(long pk) {
		return getPersistence().containsReleases(pk);
	}

	/**
	* Adds an association between the test case and the release. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the test case
	* @param releasePK the primary key of the release
	*/
	public static void addRelease(long pk, long releasePK) {
		getPersistence().addRelease(pk, releasePK);
	}

	/**
	* Adds an association between the test case and the release. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the test case
	* @param release the release
	*/
	public static void addRelease(long pk,
		com.liferay.ide.utils.quality.track.model.Release release) {
		getPersistence().addRelease(pk, release);
	}

	/**
	* Adds an association between the test case and the releases. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the test case
	* @param releasePKs the primary keys of the releases
	*/
	public static void addReleases(long pk, long[] releasePKs) {
		getPersistence().addReleases(pk, releasePKs);
	}

	/**
	* Adds an association between the test case and the releases. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the test case
	* @param releases the releases
	*/
	public static void addReleases(long pk,
		List<com.liferay.ide.utils.quality.track.model.Release> releases) {
		getPersistence().addReleases(pk, releases);
	}

	/**
	* Clears all associations between the test case and its releases. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the test case to clear the associated releases from
	*/
	public static void clearReleases(long pk) {
		getPersistence().clearReleases(pk);
	}

	/**
	* Removes the association between the test case and the release. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the test case
	* @param releasePK the primary key of the release
	*/
	public static void removeRelease(long pk, long releasePK) {
		getPersistence().removeRelease(pk, releasePK);
	}

	/**
	* Removes the association between the test case and the release. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the test case
	* @param release the release
	*/
	public static void removeRelease(long pk,
		com.liferay.ide.utils.quality.track.model.Release release) {
		getPersistence().removeRelease(pk, release);
	}

	/**
	* Removes the association between the test case and the releases. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the test case
	* @param releasePKs the primary keys of the releases
	*/
	public static void removeReleases(long pk, long[] releasePKs) {
		getPersistence().removeReleases(pk, releasePKs);
	}

	/**
	* Removes the association between the test case and the releases. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the test case
	* @param releases the releases
	*/
	public static void removeReleases(long pk,
		List<com.liferay.ide.utils.quality.track.model.Release> releases) {
		getPersistence().removeReleases(pk, releases);
	}

	/**
	* Sets the releases associated with the test case, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the test case
	* @param releasePKs the primary keys of the releases to be associated with the test case
	*/
	public static void setReleases(long pk, long[] releasePKs) {
		getPersistence().setReleases(pk, releasePKs);
	}

	/**
	* Sets the releases associated with the test case, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the test case
	* @param releases the releases to be associated with the test case
	*/
	public static void setReleases(long pk,
		List<com.liferay.ide.utils.quality.track.model.Release> releases) {
		getPersistence().setReleases(pk, releases);
	}

	public static TestCasePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestCasePersistence, TestCasePersistence> _serviceTracker =
		ServiceTrackerFactory.open(TestCasePersistence.class);
}