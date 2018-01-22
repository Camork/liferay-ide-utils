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

package com.liferay.ide.utils.quality.track.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.ide.utils.quality.track.model.TestCase;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for TestCase. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Terry Jia
 * @see TestCaseLocalServiceUtil
 * @see com.liferay.ide.utils.quality.track.service.base.TestCaseLocalServiceBaseImpl
 * @see com.liferay.ide.utils.quality.track.service.impl.TestCaseLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface TestCaseLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestCaseLocalServiceUtil} to access the test case local service. Add custom service methods to {@link com.liferay.ide.utils.quality.track.service.impl.TestCaseLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasReleaseTestCase(long releaseId, long testCaseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasReleaseTestCases(long releaseId);

	/**
	* Adds the test case to the database. Also notifies the appropriate model listeners.
	*
	* @param testCase the test case
	* @return the test case that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public TestCase addTestCase(TestCase testCase);

	public TestCase addTestCase(java.lang.String testCaseName,
		java.lang.String environment, long beforeTestCaseId,
		long afterTestCaseId, boolean automatic, java.lang.String steps,
		long categroyId, java.lang.String expectedResults,
		java.lang.String developer, long developerId,
		java.lang.String comments, ServiceContext serviceContext)
		throws PortalException;

	/**
	* Creates a new test case with the primary key. Does not add the test case to the database.
	*
	* @param testCaseId the primary key for the new test case
	* @return the new test case
	*/
	public TestCase createTestCase(long testCaseId);

	/**
	* Deletes the test case from the database. Also notifies the appropriate model listeners.
	*
	* @param testCase the test case
	* @return the test case that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public TestCase deleteTestCase(TestCase testCase);

	/**
	* Deletes the test case with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testCaseId the primary key of the test case
	* @return the test case that was removed
	* @throws PortalException if a test case with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public TestCase deleteTestCase(long testCaseId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public TestCase fetchTestCase(long testCaseId);

	/**
	* Returns the test case with the primary key.
	*
	* @param testCaseId the primary key of the test case
	* @return the test case
	* @throws PortalException if a test case with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public TestCase getTestCase(long testCaseId) throws PortalException;

	/**
	* Updates the test case in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param testCase the test case
	* @return the test case that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public TestCase updateTestCase(TestCase testCase);

	public TestCase updateTestCase(long testCaseId,
		java.lang.String testCaseName, java.lang.String environment,
		long beforeTestCaseId, long afterTestCaseId, boolean automatic,
		java.lang.String steps, long categroyId,
		java.lang.String expectedResults, java.lang.String developer,
		long developerId, java.lang.String comments,
		ServiceContext serviceContext) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getReleaseTestCasesCount(long releaseId);

	/**
	* Returns the number of test cases.
	*
	* @return the number of test cases
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTestCasesCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.ide.utils.quality.track.model.impl.TestCaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.ide.utils.quality.track.model.impl.TestCaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<TestCase> getReleaseTestCases(long releaseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<TestCase> getReleaseTestCases(long releaseId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<TestCase> getReleaseTestCases(long releaseId, int start,
		int end, OrderByComparator<TestCase> orderByComparator);

	/**
	* Returns a range of all the test cases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.ide.utils.quality.track.model.impl.TestCaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test cases
	* @param end the upper bound of the range of test cases (not inclusive)
	* @return the range of test cases
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<TestCase> getTestCases(int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	/**
	* Returns the releaseIds of the releases associated with the test case.
	*
	* @param testCaseId the testCaseId of the test case
	* @return long[] the releaseIds of releases associated with the test case
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long[] getReleasePrimaryKeys(long testCaseId);

	public void addReleaseTestCase(long releaseId, TestCase testCase);

	public void addReleaseTestCase(long releaseId, long testCaseId);

	public void addReleaseTestCases(long releaseId, List<TestCase> testCases);

	public void addReleaseTestCases(long releaseId, long[] testCaseIds);

	public void clearReleaseTestCases(long releaseId);

	public void deleteReleaseTestCase(long releaseId, TestCase testCase);

	public void deleteReleaseTestCase(long releaseId, long testCaseId);

	public void deleteReleaseTestCases(long releaseId, List<TestCase> testCases);

	public void deleteReleaseTestCases(long releaseId, long[] testCaseIds);

	public void setReleaseTestCases(long releaseId, long[] testCaseIds);
}