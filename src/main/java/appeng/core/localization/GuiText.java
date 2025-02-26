/*
 * This file is part of Applied Energistics 2. Copyright (c) 2013 - 2014, AlgorithmX2, All rights reserved. Applied
 * Energistics 2 is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version. Applied Energistics 2 is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
 * Public License for more details. You should have received a copy of the GNU Lesser General Public License along with
 * Applied Energistics 2. If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package appeng.core.localization;

import net.minecraft.util.StatCollector;

public enum GuiText {

    inventory("container"), // mc's default Inventory localization.

    Chest,
    StoredEnergy,
    Of,
    Condenser,
    Drive,
    GrindStone,
    SkyChest,

    VibrationChamber,
    SpatialIOPort,
    LevelEmitter,
    Terminal,

    Interface,
    Config,
    StoredItems,
    StoredStacks,
    Patterns,
    ImportBus,
    ExportBus,

    CellWorkbench,
    NetworkDetails,
    StorageCells,
    IOBuses,

    IOPort,
    BytesUsed,
    Types,
    QuantumLinkChamber,
    PortableCell,

    NetworkTool,
    PowerUsageRate,
    PowerInputRate,
    Installed,
    EnergyDrain,

    StorageBus,
    Priority,
    Security,
    Encoded,
    Blank,
    Unlinked,
    Linked,

    SecurityCardEditor,
    NoPermissions,
    WirelessTerminal,
    Wireless,

    CraftingTerminal,
    FormationPlane,
    Inscriber,
    QuartzCuttingKnife,

    // tunnel names
    METunnel,
    ItemTunnel,
    RedstoneTunnel,
    EUTunnel,
    FluidTunnel,
    OCTunnel,
    LightTunnel,
    RFTunnel,
    PressureTunnel,
    GTTunnel,
    IFACETunnel,

    StoredSize,
    CopyMode,
    CopyModeDesc,
    PatternTerminal,

    // Pattern tooltips
    CraftingPattern,
    ProcessingPattern,
    Crafts,
    Creates,
    And,
    With,
    Substitute,
    BeSubstitute,
    Yes,
    No,

    MolecularAssembler,

    StoredPower,
    MaxPower,
    RequiredPower,
    Efficiency,
    InWorldCrafting,

    inWorldFluix,
    inWorldPurificationCertus,
    inWorldPurificationNether,

    inWorldPurificationFluix,
    inWorldSingularity,
    ChargedQuartz,

    NoSecondOutput,
    OfSecondOutput,
    MultipleOutputs,

    Stores,
    Next,
    SelectAmount,
    Lumen,
    Empty,

    ConfirmCrafting,
    Stored,
    Crafting,
    Scheduled,
    CraftingStatus,
    RemainingOperations,
    Cancel,
    ETA,
    ETAFormat,
    SwitchCraftingSimulationDisplayMode,

    FromStorage,
    ToCraft,
    CraftingPlan,
    CalculatingWait,
    Start,
    Bytes,
    Set,

    CraftingCPU,
    Automatic,
    CoProcessors,
    Simulation,
    Missing,
    CraftingStepLimitExceeded,
    NoCraftingTreeReceived,
    RequestedItem,
    SimulationIncomplete,

    InterfaceTerminal,
    NoCraftingCPUs,
    Clean,
    InvalidPattern,
    UnknownItem,

    InterfaceTerminalHint,
    Range,
    TransparentFacades,
    TransparentFacadesHint,

    NoCraftingJobs,
    CPUs,
    FacadeCrafting,
    inWorldCraftingPresses,
    ChargedQuartzFind,

    Included,
    Excluded,
    Partitioned,
    PartitionedOre,
    Precise,
    Fuzzy,
    Filter,

    // Used in a terminal to indicate that an item is craftable
    SmallFontCraft,
    LargeFontCraft,

    // processing pattern terminal
    PatternTerminalEx,

    // renaming GUI label
    Renamer,

    // oredictionary filter GUI label
    OreFilterLabel,

    HoldShiftForTooltip,
    HoldShiftClick_HIGHLIGHT_INTERFACE,

    // Used in a ME Interface when no appropriate TileEntity was detected near it
    Nothing,

    VoidCellTooltip,

    // If a thing is deprecated
    Deprecated;

    private final String root;

    GuiText() {
        this.root = "gui.appliedenergistics2";
    }

    GuiText(final String r) {
        this.root = r;
    }

    public String getLocal() {
        return StatCollector.translateToLocal(this.getUnlocalized());
    }

    public String getUnlocalized() {
        return this.root + '.' + this;
    }
}
