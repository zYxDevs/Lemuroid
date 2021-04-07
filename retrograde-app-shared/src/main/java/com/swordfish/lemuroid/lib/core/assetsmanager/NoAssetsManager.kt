package com.swordfish.lemuroid.lib.core.assetsmanager

import com.swordfish.lemuroid.lib.core.CoreUpdater
import com.swordfish.lemuroid.lib.library.CoreID
import com.swordfish.lemuroid.lib.storage.DirectoriesManager
import io.reactivex.Completable

class NoAssetsManager : CoreID.AssetsManager {

    override fun clearAssets(directoriesManager: DirectoriesManager) = Completable.complete()

    override fun retrieveAssetsIfNeeded(
        coreUpdaterApi: CoreUpdater.CoreManagerApi,
        directoriesManager: DirectoriesManager
    ): Completable {
        return Completable.complete()
    }
}
