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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Release. This utility wraps
 * {@link com.liferay.ide.utils.quality.track.service.impl.ReleaseLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Terry Jia
 * @see ReleaseLocalService
 * @see com.liferay.ide.utils.quality.track.service.base.ReleaseLocalServiceBaseImpl
 * @see com.liferay.ide.utils.quality.track.service.impl.ReleaseLocalServiceImpl
 * @generated
 */
@ProviderType
public class ReleaseLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.ide.utils.quality.track.service.impl.ReleaseLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean hasTestCaseRelease(long testCaseId, long releaseId) {
		return getService().hasTestCaseRelease(testCaseId, releaseId);
	}

	public static boolean hasTestCaseReleases(long testCaseId) {
		return getService().hasTestCaseReleases(testCaseId);
	}

	/**
	* Adds the release to the database. Also notifies the appropriate model listeners.
	*
	* @param release the release
	* @return the release that was added
	*/
	public static com.liferay.ide.utils.quality.track.model.Release addRelease(
		com.liferay.ide.utils.quality.track.model.Release release) {
		return getService().addRelease(release);
	}

	public static com.liferay.ide.utils.quality.track.model.Release addRelease(
		java.lang.String releaseName, java.lang.String releaseRootUrl,
		java.lang.String releaseUserName, java.util.Date releaseDate,
		long[] testCaseIds,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addRelease(releaseName, releaseRootUrl, releaseUserName,
			releaseDate, testCaseIds, serviceContext);
	}

	/**
	* Creates a new release with the primary key. Does not add the release to the database.
	*
	* @param releaseId the primary key for the new release
	* @return the new release
	*/
	public static com.liferay.ide.utils.quality.track.model.Release createRelease(
		long releaseId) {
		return getService().createRelease(releaseId);
	}

	/**
	* Deletes the release from the database. Also notifies the appropriate model listeners.
	*
	* @param release the release
	* @return the release that was removed
	*/
	public static com.liferay.ide.utils.quality.track.model.Release deleteRelease(
		com.liferay.ide.utils.quality.track.model.Release release) {
		return getService().deleteRelease(release);
	}

	/**
	* Deletes the release with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param releaseId the primary key of the release
	* @return the release that was removed
	* @throws PortalException if a release with the primary key could not be found
	*/
	public static com.liferay.ide.utils.quality.track.model.Release deleteRelease(
		long releaseId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteRelease(releaseId);
	}

	public static com.liferay.ide.utils.quality.track.model.Release fetchRelease(
		long releaseId) {
		return getService().fetchRelease(releaseId);
	}

	/**
	* Returns the release with the primary key.
	*
	* @param releaseId the primary key of the release
	* @return the release
	* @throws PortalException if a release with the primary key could not be found
	*/
	public static com.liferay.ide.utils.quality.track.model.Release getRelease(
		long releaseId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getRelease(releaseId);
	}

	/**
	* Updates the release in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param release the release
	* @return the release that was updated
	*/
	public static com.liferay.ide.utils.quality.track.model.Release updateRelease(
		com.liferay.ide.utils.quality.track.model.Release release) {
		return getService().updateRelease(release);
	}

	public static com.liferay.ide.utils.quality.track.model.Release updateRelease(
		long releaseId, java.lang.String releaseName,
		java.lang.String releaseRootUrl, java.lang.String releaseUserName,
		java.util.Date releaseDate, long[] testCaseIds,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateRelease(releaseId, releaseName, releaseRootUrl,
			releaseUserName, releaseDate, testCaseIds, serviceContext);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of releases.
	*
	* @return the number of releases
	*/
	public static int getReleasesCount() {
		return getService().getReleasesCount();
	}

	public static int getTestCaseReleasesCount(long testCaseId) {
		return getService().getTestCaseReleasesCount(testCaseId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.ide.utils.quality.track.model.impl.ReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.ide.utils.quality.track.model.impl.ReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the releases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.ide.utils.quality.track.model.impl.ReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of releases
	* @param end the upper bound of the range of releases (not inclusive)
	* @return the range of releases
	*/
	public static java.util.List<com.liferay.ide.utils.quality.track.model.Release> getReleases(
		int start, int end) {
		return getService().getReleases(start, end);
	}

	public static java.util.List<com.liferay.ide.utils.quality.track.model.Release> getTestCaseReleases(
		long testCaseId) {
		return getService().getTestCaseReleases(testCaseId);
	}

	public static java.util.List<com.liferay.ide.utils.quality.track.model.Release> getTestCaseReleases(
		long testCaseId, int start, int end) {
		return getService().getTestCaseReleases(testCaseId, start, end);
	}

	public static java.util.List<com.liferay.ide.utils.quality.track.model.Release> getTestCaseReleases(
		long testCaseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.ide.utils.quality.track.model.Release> orderByComparator) {
		return getService()
				   .getTestCaseReleases(testCaseId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Returns the testCaseIds of the test cases associated with the release.
	*
	* @param releaseId the releaseId of the release
	* @return long[] the testCaseIds of test cases associated with the release
	*/
	public static long[] getTestCasePrimaryKeys(long releaseId) {
		return getService().getTestCasePrimaryKeys(releaseId);
	}

	public static void addTestCaseRelease(long testCaseId,
		com.liferay.ide.utils.quality.track.model.Release release) {
		getService().addTestCaseRelease(testCaseId, release);
	}

	public static void addTestCaseRelease(long testCaseId, long releaseId) {
		getService().addTestCaseRelease(testCaseId, releaseId);
	}

	public static void addTestCaseReleases(long testCaseId,
		java.util.List<com.liferay.ide.utils.quality.track.model.Release> releases) {
		getService().addTestCaseReleases(testCaseId, releases);
	}

	public static void addTestCaseReleases(long testCaseId, long[] releaseIds) {
		getService().addTestCaseReleases(testCaseId, releaseIds);
	}

	public static void clearTestCaseReleases(long testCaseId) {
		getService().clearTestCaseReleases(testCaseId);
	}

	public static void deleteTestCaseRelease(long testCaseId,
		com.liferay.ide.utils.quality.track.model.Release release) {
		getService().deleteTestCaseRelease(testCaseId, release);
	}

	public static void deleteTestCaseRelease(long testCaseId, long releaseId) {
		getService().deleteTestCaseRelease(testCaseId, releaseId);
	}

	public static void deleteTestCaseReleases(long testCaseId,
		java.util.List<com.liferay.ide.utils.quality.track.model.Release> releases) {
		getService().deleteTestCaseReleases(testCaseId, releases);
	}

	public static void deleteTestCaseReleases(long testCaseId, long[] releaseIds) {
		getService().deleteTestCaseReleases(testCaseId, releaseIds);
	}

	public static void setTestCaseReleases(long testCaseId, long[] releaseIds) {
		getService().setTestCaseReleases(testCaseId, releaseIds);
	}

	public static ReleaseLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ReleaseLocalService, ReleaseLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ReleaseLocalService.class);
}